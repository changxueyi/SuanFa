package LeetCode.链表;

/**
 * @ClassName _203_删除链表指定值https://leetcode-cn.com/problems/remove-linked-list-elements/
 * @Description TODO
 * @Author changxueyi
 * 输入: 1->2->6->3->4->5->6, val = 6
 * 输出: 1->2->3->4->5
 * @Date 2020/2/17 17:14
 */
public class _203_删除链表指定值 {
    //方法三 虚拟头节点 推荐使用
    public ListNode removeElements3(ListNode head, int val) {

        ListNode dummyHead = new ListNode(-1);
        dummyHead.next = head;

        ListNode prev = dummyHead;
        while(prev.next != null){
            if(prev.next.val == val)
                prev.next = prev.next.next;
            else
                prev = prev.next;
        }

        return dummyHead.next;
    }

    //方法一：不适用虚拟头节点
    public ListNode removeElements(ListNode head, int val) {
        //当头节点为空，但是头节点就是要删除的元素时候
        while (head != null && head.val == val) {
            //定义一个节点为delNode就是head
            ListNode delNode = head;
            //现在的head是head.next;
            head = head.next;
            //原来的头节点，也就是删除的节点指向空
            delNode.next = null;
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
    //方法二
    public ListNode removeElements1(ListNode head, int val) {
        //当头节点为空，但是头节点就是要删除的元素时候
        while (head != null && head.val == val) {
            head = head.next;
        }
        if (head == null) {
            return null;
        }
        ListNode prev = head;
        while (prev.next != null) {
            if (prev.next.val == val) {
                prev.next = prev.next.next;
            } else {
                prev = prev.next;
            }
        }
        return head;
    }


}