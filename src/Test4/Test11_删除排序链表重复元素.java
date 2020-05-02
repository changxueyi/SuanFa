package Test4;

/**
 * @ClassName Test11_删除排序链表重复元素
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/4/29 7:37
 */
public class Test11_删除排序链表重复元素 {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) return head;

        ListNode cur = head;
        while (cur != null && cur.next != null) {
            if (cur.val != cur.next.val) {
                cur.next = cur.next.next;
            } else {
                cur = cur.next;
            }
        }
        return cur;
    }

    public ListNode removeElements(ListNode head, int val) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode cur = dummy;
        while (cur.next != null) {
            if (cur.next.val == val) {
                cur.next = cur.next.next;
            } else {
                cur = cur.next;
            }
        }
        return dummy.next;
    }

}