package Test3;


/**
 * @ClassName SX_15_测试
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/4/26 21:09
 */
public class SX_15_测试 {
    // public private default protect
    public int fun(ListNode head, int k) {
        if (head == null) {
            return -1;
        }
        ListNode cur = head;
        ListNode pre = head;
        for (int i = 0; i < k; i++) {
            pre = pre.next;
        }
        while (pre != null) {
            pre = pre.next;
            cur = cur.next;
        }
        return cur.val;
    }

    public int fun01(ListNode l1, ListNode l2) {
        if (l1 == null || l2 == null) {
            return -1;
        }
        ListNode cur = l1;
        ListNode pre = l2;
        while (cur != pre) {
            if (cur != null) {
                cur = cur.next;
            } else {
                cur = l2;
            }
            if (pre != null) {
                pre = pre.next;
            } else {
                pre = l1;
            }
        }
        return cur.val;
    }


}