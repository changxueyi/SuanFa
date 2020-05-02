package Test4;

/**
 * @ClassName Test07_环形链表
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/4/28 15:54
 */
public class Test07_环形链表 {
    public boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null || fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast==slow)
                return true;
        }
        return false;
    }
}