package Test.链表;

import LeetCode.链表.ListNode;

/**
 * @ClassName _24_反转链表
 * @Description TODO定义一个函数，输入一个链表的头节点，反转该链表并输出反转后链表的头节点。
 * 输入: 1->2->3->4->5->NULL
 * 输出: 5->4->3->2->1->NULL
 * @Author changxueyi
 * @Date 2020/2/20 0:42
 */
public class _24_反转链表 {
    public ListNode reverseList(ListNode head) {
        if (head==null||head.next==null){
            return head;
        }
        ListNode newListNode = reverseList(head.next);
        head.next.next = head;
        head.next=null;
        return newListNode;
    }

    //反转链表
    public ListNode reverseList1(ListNode head) {
        //此处注意，两边的顺序不要变
        if (head==null||head.next==null){
            return head;
        }
        ListNode newHead = reverseList(head.next);
        head.next.next = head;
        head.next=null;
        return newHead;
    }


}