package LeetCode.链表;

/**
 * @ClassName _141_pro_链表这个环的位置
 * @Description TODO https://www.cnblogs.com/kyoner/p/11087755.html
 * @Author changxueyi
 * @Date 2020/4/21 15:39
 */
public class _141_pro_链表这个环的位置 {
    //https://www.cnblogs.com/kyoner/p/11087755.html
    ListNode detectCycle(ListNode head) {
        ListNode fast, slow;
        fast = slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow)
                break;
        }

        slow = head;
        while (slow != fast) {
            fast = fast.next;
            slow = slow.next;
        }
        return slow;
    }
}