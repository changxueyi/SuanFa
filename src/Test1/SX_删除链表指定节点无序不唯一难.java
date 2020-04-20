package Test1;

/**
 * @ClassName SX_删除链表指定节点无序不唯一难
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/4/20 16:12
 */
public class SX_删除链表指定节点无序不唯一难 {
    //https://leetcode-cn.com/problems/remove-linked-list-elements/
    //不是排序的
    public ListNode removeElements(ListNode head, int val) {
        ListNode sentinel = new ListNode(0);
        sentinel.next = head;

        ListNode pre = sentinel;
        ListNode curr = head;
        while (curr != null) {
            if (curr.val == val) {
                pre.next = curr.next;
            } else {
                pre = curr;
            }
            curr = curr.next;
        }
        return sentinel.next;
    }
}