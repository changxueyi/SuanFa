package Test2;


/**
 * @ClassName _12_合并两个有序链表
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/4/5 9:14
 */
public class _12_合并两个有序链表 {
    public ListNode hebing(ListNode l1, ListNode l2) {
        ListNode head1 = l1;
        ListNode head2 = l2;
        ListNode newHead = new ListNode(-1);
        ListNode pre = newHead;

        while (head1 != null && head2 != null) {
            if (head1.val > head2.val) {
                pre.next = head2;
                head2 = head2.next;
            }
            else {
                pre.next= head1;
                head1 = head1.next;
            }
            pre = pre.next;
        }
        if (head1 == null) {
            pre.next = head2;
        } else {
            pre.next = head1;
        }
        return newHead.next;
    }
}