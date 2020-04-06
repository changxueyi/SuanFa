package LeetCode.链表;

/**
 * @ClassName _22_链表中倒数第K个节点
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/3/16 13:48
 */
public class _22_链表中倒数第K个节点 {
    /**
     * 输入一个链表，输出该链表中倒数第k个节点。为了符合大多数人的习惯，
     * 本题从1开始计数，即链表的尾节点是倒数第1个节点。例如，一个链表有6个节点，从头节点开始
     * ，它们的值依次是1、2、3、4、5、6。这个链表的倒数第3个节点是值为4的节点。
     * 给定一个链表: 1->2->3->4->5, 和 k = 2.
     * 返回链表 4->5.
     */

    //解体思路是：双指针，中间相差K个节点，前面指针指到头，这个指针就是要删除的节点

    //13点59
    public ListNode getKthFromEnd(ListNode head, int k) {
        ListNode former = head;
        ListNode latter = head;
        for (int i = 0; i < k; i++)
            former = former.next;
        while (former != null) {
            former = former.next;
            latter = latter.next;
        }
        return latter;
    }

    //利用双指针，开始走
    public ListNode deleteNode(ListNode head, int k) {
        ListNode former = head;
        ListNode latter = head;
        for (int i = 0; i < k; i++) {
            former = former.next;
        }
        while (former != null) {
            former = former.next;
            latter = latter.next;
        }
        return latter;
    }

    //10点38分 2020/4/5
    public ListNode getKthFromEnd02(ListNode head, int k) {
        ListNode fast =head;
        ListNode slow = head;
        for (int i=0;i<k;i++){
            fast= fast.next;
        }
        while (fast!=null){
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }

}