package Test1;


/**
 * @ClassName SX_链表的中间节点
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/4/20 16:43
 */
public class SX_链表的中间节点 {
    public static ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        //为啥这里是并且，而不是或者呢
        while (fast != null || fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
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
        //middleNode(node1);
        System.out.println(middleNode(node1));
    }
}