package Test4;

/**
 * @ClassName Test03_删除链表倒数第K个结点
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/4/28 14:46
 */
public class Test03_删除链表倒数第K个结点 {
    public ListNode getKthFromEnd(ListNode head, int k) {
        if (head == null || head.next == null) return head;

        ListNode cur = head;
        ListNode pre = head;
        for (int i = 0; i < k; i++) {
            pre = pre.next;
        }
        while (pre != null) {
            pre = pre.next;
            cur = cur.next;
        }
        return cur;
    }
}
