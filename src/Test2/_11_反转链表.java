package Test2;

/**
 * @ClassName _11_反转链表
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/4/5 9:10
 */
public class _11_反转链表 {
    public ListNode reverse(ListNode head){
        if (head==null&&head.next==null){
            return head;
        }
        ListNode newHead = reverse(head.next);
        head.next.next=head;
        head.next = null;
        return newHead;

    }
}