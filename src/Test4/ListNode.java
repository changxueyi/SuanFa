package Test4;

/**
 * @ClassName ListNode
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/2/17 17:16
 */
public class ListNode<E> {
    public int val;
    public ListNode next;

    public ListNode(int x) {
        val = x;
    }

    //测试
    public static void main(String[] args) {
        // node 1      1 -> 2 ->3 ->6 ->7
        // node 2    4 ->5->6 ->7
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        ListNode node6 = new ListNode(6);
        ListNode node7 = new ListNode(7);
        node1.next = node2;
        node2.next = node3;
        node3.next = node6;
        node4.next = node5;
        node5.next = node6;
        node6.next = node7;
        //   函数调用,传入两个链表    ListNode commonNode = getIntersectionNode(node1,node4);
        //      System.out.println(commonNode.val);

    }
}