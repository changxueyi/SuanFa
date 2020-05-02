package LeetCode.leetcode精选TOP100;

/**
 * @ClassName lc_160_相交链表
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/4/30 14:22
 */
public class lc_160_相交链表 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) return null;

        ListNode curA = headA;
        ListNode curB = headB;
        while (curA != curB) {
            if (curA != null) {
                curA = curA.next;
            } else {
                curA = headB;
            }
            if (curB != null) {
                curB = curB.next;
            } else {
                curB = headA;
            }
        }
        return curA;
    }
}