package LeetCode.链表;

/**
 * @ClassName lc_02_07链表相交
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/4/13 17:06
 */
public class lc_02_07链表相交 {
    // 给两个链表，判断是否相交，如果相交，返回相交的节点

    //消除长度差，最终两个指针要么相遇，要么都是空
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null)
            return null;

        ListNode pa = headA;
        ListNode pb = headB;
        while (pa != pb) {
            if (pa != null) {
                pa = pa.next;
            } else {
                pa = headB;
            }
            if (pb != null) {
                pb = pb.next;
            } else {
                pb = headA;
            }
        }
        //会在pa == null and pb == null时终止循环 ,不会导致死循环，会在pa == null and pb == null时终止循环
        if (pa == null) {
            return null;
        }
        return pa;
    }
}