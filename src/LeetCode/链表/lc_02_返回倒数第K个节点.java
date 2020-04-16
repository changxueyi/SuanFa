package LeetCode.链表;

/**
 * @ClassName lc_02_返回倒数第K个节点
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/4/14 10:43
 */
public class lc_02_返回倒数第K个节点 {
    public int kthToLast(ListNode head, int k) {
        //思路，快慢指针
        ListNode pre = head;
        ListNode cur = head;
        for (int i = 0; i < k; i++) {
            pre = pre.next;
        }
        while (pre != null) {
            pre = pre.next;
            cur = cur.next;
        }
        return cur.val;
    }



}