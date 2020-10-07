package LeetCode.链表;

import 链表03.LinkedList;
import 链表03.List;

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

    //17点59分 2020/07/22
    public ListNode reverseList2(ListNode head) {
        if (head == null || head.next == null)
            return head;
        ListNode newHead = reverseList2(head.next);
        head.next.next = head;
        head.next = null;

        return newHead;
    }

    //16点23分 2020/3/29
    public ListNode reverseList1(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode newHead = reverseList1(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }

    //非递归
    public static ListNode fun01(ListNode head) {
        ListNode pre = null;
        ListNode dummy = null;
        ListNode cur = head;
        while (cur != null) {
            pre = cur.next;
            cur.next = dummy;
            dummy = cur;
            cur = pre;
        }
        return dummy;
    }

    //再来一种方法
    public ListNode fun02(ListNode head) {
        ListNode pre = null;
        ListNode dummy = null;
        ListNode cur = head;
        while (cur != null) {
            pre = cur.next;
            cur.next = dummy;
            dummy = cur;
            cur = pre;
        }
        return dummy;
    }

    //14点41分 2020/07/25 北京
    public ListNode reverseList5(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode newHead = reverseList5(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }

    //14点53分 2020/07/25 非递归实现
    public ListNode reverseList6(ListNode head) {
        ListNode pre = null;
        ListNode dummy = null;
        ListNode cur = head;
        while (cur != null) {
            pre = cur.next;
            cur.next = dummy;
            dummy = cur;
            cur = pre;
        }
        return dummy;
    }
}