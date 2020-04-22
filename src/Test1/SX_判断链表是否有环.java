package Test1;

/**
 * @ClassName SX_判断链表是否有环
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/4/20 15:22
 */
public class SX_判断链表是否有环 {
    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }
        ListNode slow = head;
        ListNode fast = head.next;

        while (slow != fast) {
            //如果fast节点为空，或者节点的next为空，返回

            if (fast == null || fast.next == null) {
                return false;
            }
            slow = slow.next;
            //fast一次走两步，
            fast = fast.next.next;
        }
        return true;
    }

    public boolean hasCycle1(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }
        ListNode slow = head;
        ListNode fast = head.next;
        while (slow != fast) {
            if (fast == null || fast.next == null) {
                return false;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        return true;
    }

    public boolean fun(ListNode head) {
        //必须用快慢指针做
        return true;
    }

}