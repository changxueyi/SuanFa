package Test4;

import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;

/**
 * @ClassName Test08_删除链表指定值
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/4/28 16:01
 */
public class Test08_删除链表指定值 {
    public ListNode removeElements(ListNode head, int val) {

        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode temp = dummy;
        while (temp.next != null) {
            if (temp.next.val == val) {
                temp.next = temp.next.next;
            } else {
                temp = temp.next;
            }
        }
        return dummy.next;
    }
}