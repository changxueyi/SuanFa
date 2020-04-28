package Test3;

import LeetCode.链表.ListNode;

/**
 * @ClassName SX_16_两两反转链表
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/4/28 8:23
 */
public class SX_16_两两反转链表 {
    public ListNode fun(ListNode head) {
        if (head == null || head.next == null)
            return head;
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode temp = dummy;
        while (temp.next != null && temp.next.next != null) {
            ListNode start = temp.next;
            ListNode end = temp.next.next;
            temp.next = end;
            start.next = end.next;
            end.next = start;

            temp = start;
        }
        return temp.next;
    }
}