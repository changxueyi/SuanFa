package Test.链表;

import LeetCode.链表.ListNode;

/**
 * @ClassName _203_移除链表元素
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/2/20 9:17
 */
public class _203_移除链表元素 {
    public ListNode removeElements(ListNode head, int val) {
        while (head != null && head.val == val) {
            head = head.next;
        }
        if (head == null) {
            return null;
        }
        ListNode prev = head;
        while (prev.next != null) {
            if (prev.next.val == val) {
                ListNode delNode = prev.next;
                prev.next = delNode.next;
                delNode.next = null;
            } else {
                prev = prev.next;
            }
        }
        return head;
    }

    //方法二:使用头节点
    public ListNode removeElements1(ListNode head, int val) {
        ListNode dummyHead = new ListNode(-1);
        dummyHead.next = head;
        while (dummyHead.next!=null){
            if (dummyHead.next.val==val){
                ListNode delNode = dummyHead.next;
                dummyHead.next=delNode.next;
                delNode.next=null;
            }else {
                dummyHead = dummyHead.next;
            }
        }
        return head;

    }
}