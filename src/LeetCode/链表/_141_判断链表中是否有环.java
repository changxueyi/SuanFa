package LeetCode.链表;


/**
 * @ClassName _141_判断链表中是否有环https://leetcode-cn.com/problems/linked-list-cycle/
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/2/17 17:12
 */
public class _141_判断链表中是否有环 {
    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }
        ListNode slow = head;
        ListNode fast = head.next;

        while (slow != fast) {
            //如果fast节点为空，或者节点的next为空，返回

            //********************************
            //*************下面这两行代码必须一块，不然报错，这里我不理解为啥****************
            if (fast == null || fast.next == null) {
                return false;
            }
            slow = slow.next;
            //fast一次走两步，
            fast = fast.next.next;
        }
        return true;
    }
}