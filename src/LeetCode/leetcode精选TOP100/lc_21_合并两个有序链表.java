package LeetCode.leetcode精选TOP100;

/**
 * @ClassName lc_21_合并两个有序链表
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/4/30 10:58
 */
public class lc_21_合并两个有序链表 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null || l2 == null) return null;

        ListNode a = l1;
        ListNode b = l2;
        ListNode dummy = new ListNode(-1);
        ListNode c = dummy;

        while (a != null && b != null) {
            if (a.val > b.val) {
                c.next  = b;
                b = b.next;
            }else {
                c.next = a;
                a = a.next;
            }
            c = c.next;
        }
        if (a==null){
            c.next = b;
        }else {
            c.next = a;
        }
        return dummy.next;
    }
}