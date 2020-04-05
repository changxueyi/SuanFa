package Test.测试;

/**
 * @ClassName _24_反转链表
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/3/24 20:14
 */
public class _24_反转链表 {
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
        }
    }

    public ListNode reverseList(ListNode head) {
        if (head==null||head.next==null ){
            return head;
        }
        ListNode newHead = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }
}