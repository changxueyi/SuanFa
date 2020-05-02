package Test4;

import com.sun.xml.internal.ws.addressing.WsaTubeHelperImpl;

/**
 * @ClassName Test04_合并两个有序链表
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/4/28 15:08
 */
public class Test04_合并两个有序链表 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode a = l1;
        ListNode b = l2;
        ListNode c = new ListNode(0);
        ListNode d = c;
        while (a != null && b != null) {
            if (a.val > b.val) {
                d.next = b;
                b = b.next;
            } else {
                d.next = a;
                a = a.next;
            }
            d = d.next;
        }
        if (a == null) {
            d.next = b;
        } else {
            d.next = a;
        }
        return c.next;
    }
}