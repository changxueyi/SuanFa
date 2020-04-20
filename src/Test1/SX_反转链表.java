package Test1;

/**
 * @ClassName SX_反转链表
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/4/20 10:28
 */
public class SX_反转链表 {
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null)
            return head;
        ListNode newHead = reverseList(head.next);
        head.next.next = head;
        head = null;
        return newHead;
    }

    //双指针
    public ListNode funzhan(ListNode head) {
        ListNode a = head;
        ListNode b = null;
        ListNode c = null;
        while (a != null) {
            c = a.next;
            a.next = b;
            b = a;
            a = c;
        }
        return b;
    }
}