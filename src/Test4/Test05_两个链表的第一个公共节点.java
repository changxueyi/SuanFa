package Test4;

/**
 * @ClassName Test05_两个链表的第一个公共节点
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/4/28 15:23
 */
public class Test05_两个链表的第一个公共节点 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) return null;

        ListNode a1 = headA;
        ListNode b1 = headB;

        while (a1 != b1) {
            if (a1 != null) {
                a1 = a1.next;
            } else {
                a1 = headB;
            }
            if (b1 != null) {
                b1 = b1.next;
            } else {
                b1 = headA;
            }
        }
        return a1;
    }
}