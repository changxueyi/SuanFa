package Test2;

import 链表03.List;

/**
 * @ClassName _18_删除链表的节点
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/4/3 15:43
 */
public class _18_删除链表的节点 {
    public ListNode deleteNode(ListNode head, int val) {
        if (head.val == val) return head.next;
        ListNode first = head;
        ListNode last = head.next;

        while (last.val != val && last != null) {
            first = last;
            last = last.next;
        }
        if (last != null)
            return first.next = last.next;
        return head;
    }

    public ListNode deleteNode1(ListNode head, int val) {
        if (head.val == val) return head.next;
        ListNode pre = head;
        ListNode cur = head.next;

        while (cur.val != val && cur != null) {
            pre = cur;
            cur = cur.next;
        }
        if (cur != null) {
            return pre.next = cur.next;
        }
        return head;
    }
}