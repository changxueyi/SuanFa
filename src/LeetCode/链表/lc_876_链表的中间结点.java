package LeetCode.链表;

/**
 * @ClassName lc_876_链表的中间结点
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/4/13 16:09
 */
public class lc_876_链表的中间结点 {
    public ListNode middleNode(ListNode head) {
        ListNode cur = head;
        ListNode pre = head;
        int i = 0;
        while (cur != null) {
            cur = cur.next;
            i++;
        }
        int a = i / 2;
        for (int b = 0; b < a; b++) {
            pre = pre.next;
        }
        return pre;
    }

    //方法二：快慢指针  16点25分 2020/4/13
    //我们可以继续优化方法二，用两个指针 slow 与 fast 一起遍历链表。
    // slow 一次走一步，fast 一次走两步。那么当 fast 到达链表的末尾时，
    // slow 必然位于中间。
    public ListNode middleNode1(ListNode head) {
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;

    }
}