package LeetCode.链表;


/**
 * @ClassName SX_03_两两反转链表
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/4/28 13:57
 */
public class SX_03_两两反转链表 {
    public static ListNode fun(ListNode head) {
        // if (head == null || head.next == null) return head;

        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode temp = dummy;
        //可以避免奇数偶数问题
        while (temp.next != null && temp.next.next != null) {
            ListNode start = temp.next;
            ListNode end = temp.next.next;
            //开始交换
            temp.next = end;
            start.next = end.next;
            end.next = start;


            //循环，同时后移
            temp = start;
        }
        return dummy.next;
    }

    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        ListNode currNode = fun(node1);
        while (currNode.next != null) {
            System.out.print(currNode.val);
            System.out.print("->");
            currNode = currNode.next;
        }
        System.out.print(currNode.val);
        System.out.println();
    }
}