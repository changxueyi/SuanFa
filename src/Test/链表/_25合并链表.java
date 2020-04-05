package Test.链表;

import LeetCode.链表.ListNode;

/**
 * @ClassName _25合并链表
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/2/29 20:52
 */
public class _25合并链表 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        //1.定义两个链表的头节点，相当于定义两个指针
        ListNode head1 = l1;
        ListNode head2 = l2;
        //创建一个空链表,随便写一个值，代表的是这里面有值存在
        ListNode newHead = new ListNode(1);
        ListNode ptr = newHead;
        while (head1!=null&&head2!=null){
            if (head1.val>head2.val){
                ptr.next = head2;
                head2 = head2.next;
            }else {
                ptr.next = head1;
                head1 = head1.next;
            }
            //不管两个链表如何指，新创建的这个链表每次拿过来一个数的时候，必须要加一
            ptr = ptr.next;
        }
        //当其中一个链表走完的时候，另一个直接加过来
        if (head1==null){
            ptr.next=head2;
        }
        if (head2==null){
            ptr.next=head1;
        }
        //疑问点：为什么是返回链表的next,而不是返回newHead
        return newHead.next;

    }
}