package Test1;

import 链表03.List;

/**
 * @ClassName SX_链表中倒数第K个节点
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/4/20 9:03
 */
public class SX_链表中倒数第K个节点 {
    public static ListNode fun1(ListNode head, int k) {
        if (head == null || head.next == null)
            return head;
        ListNode a = head;
        ListNode b = head;
        for (int i = 0; i < k; i++) {
            a = a.next;
        }
        //这里应该是a！=null,而不是a.next != null
        while (a != null) {
            b = b.next;
            a = a.next;
        }
        return b;
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
        ListNode a  = fun1(node1,1);
        System.out.println(a.val);
    }
}