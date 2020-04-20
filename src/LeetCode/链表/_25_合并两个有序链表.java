package LeetCode.链表;

/**
 * @ClassName _25_合并两个有序链表
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/2/27 20:05
 */
public class _25_合并两个有序链表 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        //1.定义三个指针执行三条链
        ListNode head1 = l1;
        ListNode head2 = l2;
        ListNode newHead = new ListNode(-1);
        ListNode ptr = newHead;

        //2.移动两条链的指针
        while (head1 != null && head2 != null) {
            if (head1.val < head2.val) {
                ptr.next = head1;
                head1 = head1.next;
            } else {
                ptr.next = head2;
                head2 = head2.next;
            }
            ptr = ptr.next;
        }
        if (head1 == null)
            ptr.next = head2;
        else
            ptr.next = head1;
        return newHead.next;
    }

    //20点58分  2020/3/24
    public ListNode mergeTwoLists2(ListNode l1, ListNode l2) {
        ListNode a1 = l1;
        ListNode a2 = l2;
        //初始化一个节点值为0的空节点
        ListNode newListNode = new ListNode(0);
        //创建头节点
        ListNode a3 = newListNode;
        //让 a1.val 与 a2.val 比较，如果a1大，则newListNode指向a1，
        while (a1 != null && a2 != null) {
            if (a1.val > a2.val) {
                a3.next = a2;
                a2 = a2.next;
            } else {
                a3.next = a1;
                a1 = a1.next;
            }
            a3 = a3.next;
        }
        if (a1 == null) {
            a3.next = a2;
        } else {
            a3.next = a1;
        }
        return newListNode.next;
    }


}