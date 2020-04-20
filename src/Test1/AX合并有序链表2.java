package Test1;

/**
 * @ClassName AX合并有序链表2
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/4/20 21:58
 */
public class AX合并有序链表2 {
    public ListNode fun(ListNode l1, ListNode l2) {
        ListNode a = l1;
        ListNode b = l2;
        ListNode pre = new ListNode(1);
        ListNode c = pre;
        while (a != null || b != null) {
            if (b.val > a.val) {
                c.next = a;
                a = a.next;
            } else {
                c.next = b;
                b = b.next;
            }
            c = c.next;
        }
        if (a == null) {
            c.next = b;
        } else {
            c.next = a;
        }
        return pre.next;

    }
}