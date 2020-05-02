package Test4;

/**
 * @ClassName Test02_删除链表的结点
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/4/28 14:41
 */
public class Test02_删除链表的结点 {
    public static ListNode deleteNode(ListNode head, int val) {
        if (head == null || head.next == null) return null;
        if (head.val == val)
            return head.next;
        ListNode cur = head;
        ListNode pre = head.next;

        while (pre != null && pre.val != val) {
            pre = pre.next;
            cur = cur.next;
        }
        if (pre.val == val) {
            cur.next = cur.next.next;
        }
        return head;
    }

    public static void main(String[] args) {
        ListNode node1 = new ListNode(0);
        ListNode node2 = new ListNode(1);
        ListNode node3 = new ListNode(2);
        ListNode node4 = new ListNode(3);
        ListNode node5 = new ListNode(4);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        ListNode result = deleteNode(node1, 1);
        while (result!= null) {
            System.out.print(result.val);
            System.out.print("->");
            result = result.next;
        }
        System.out.println();
    }
}