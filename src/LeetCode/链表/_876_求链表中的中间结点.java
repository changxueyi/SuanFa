package LeetCode.链表;

/**
 * @ClassName _876_求链表中的中间结点
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/3/12 21:17
 */
public class _876_求链表中的中间结点 {
    //快慢指针法，慢的走一步，快的走两步
    public ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        //下面这句话，适用于奇数，偶数
        //为啥不是或者，而是并且？？？？？？？？？？？？？？？？？？？
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    //14点54分 2020/07/25 北京
    public ListNode middleNode1(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
             slow = slow.next;
             fast = fast.next;
        }
        return slow;
    }
}