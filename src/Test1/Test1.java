package Test1;

/**
 * @ClassName Test1
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/4/19 21:56
 */
public class Test1 {
    public ListNode fun(ListNode l1, ListNode l2) {
        ListNode a = l1;
        ListNode b = l2;
        ListNode pre = new ListNode(1);
        ListNode cur = pre;

        while (a != null && b != null) {
            if (b.val > a.val) {
                cur.next = a;
                a = a.next;
            } else {
                cur.next = b;
                b = b.next;
            }
            //都要走下面这步
            cur = cur.next;
        }
        if (a == null) {
            cur.next = b;
        }
        if (b == null) {
            cur.next = a;
        }
        return pre.next;
    }
}