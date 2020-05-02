package LeetCode.链表;

/**
 * @ClassName lc_19_删除链表的倒数第N个节点
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/4/30 10:40
 */
public class lc_19_删除链表的倒数第N个节点 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null) return null;
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode pre = dummy;
        ListNode cur = head;

        ListNode fast = head;
        for (int i = 0; i < n; i++) {
            fast = fast.next;
        }
        while (fast != null) {
            fast = fast.next;
            cur = cur.next;
            pre = pre.next;
        }
        if (fast == null) {
            pre.next = pre.next.next;
        }
        return dummy.next;
    }
}