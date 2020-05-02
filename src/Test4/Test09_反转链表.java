package Test4;

/**
 * @ClassName Test09_反转链表
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/4/28 16:15
 */
public class Test09_反转链表 {
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) return head;

        ListNode newHead = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }

    //非递归
    public ListNode reverseList1(ListNode head) {
        ListNode pre = null;
        ListNode cur = head;
        ListNode temp = null;
        while (cur != null) {
            temp = cur.next;
            cur.next = pre;
            pre = cur;
            cur = temp;
        }
        return pre;
    }
}