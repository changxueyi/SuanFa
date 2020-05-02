package Test4;

/**
 * @ClassName Test06_删除排序链表中重复的元素_星星
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/4/28 15:32
 */
public class Test06_删除排序链表中重复的元素_星星 {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) return null;

        ListNode cur = head;
        while (cur != null && cur.next != null) {
            if (cur.val == cur.next.val) {
                cur.next = cur.next.next;
            } else {
                cur = cur.next;
            }
        }
        return head;
    }
}