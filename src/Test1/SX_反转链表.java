package Test1;

/**
 * @ClassName SX_反转链表
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/4/20 10:28
 */
public class SX_反转链表 {
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null)
            return head;
        ListNode newHead = reverseList(head.next);
        head.next.next = head;
        head = null;
        return newHead;
    }

    //双指针
    public ListNode funzhan(ListNode head) {
        ListNode a = head;
        ListNode b = null;
        ListNode c = null;
        while (a != null) {
            c = a.next;
            a.next = b;
            b = a;
            a = c;
        }
        return b;
    }


    public static ListNode fun01(ListNode head) {
        ListNode pre = null;
        ListNode dummy = null;
        ListNode cur = head;
        while (cur != null) {
            pre = cur.next;
            cur.next = dummy;
            dummy = cur;
            cur = pre;
        }
        return dummy;
    }

    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(2);
        ListNode node4 = new ListNode(2);
        ListNode node5 = new ListNode(3);
        ListNode node6 = new ListNode(5);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;
        ListNode a = fun01(node1);
        while (a != null) {
            System.out.print(a.val + "->");
            a = a.next;
        }
    }
}
