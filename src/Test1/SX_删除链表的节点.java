package Test1;

/**
 * @ClassName SX_删除链表的节点
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/4/20 9:17
 */
public class SX_删除链表的节点 {
    //链表没有顺序，直接进行比较即可

    //返回链表的头节点
   /* public ListNode delete(ListNode head, int val) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode a = null;
        ListNode b = head;
        while (b.next != null || b.val != val) {
            b = b.next;
            a = a.next;
        }
        a.next = b.next;
        return a;
    }*/

    //删除链表节点
    //14点21分 2020/4/20  双百答案
    public ListNode fun(ListNode head, int val) {
        if (head == null || head.next == null) {
            return head;
        }
        if (head.val == val)
            return head.next;
        ListNode cur = head;
        ListNode pre = head.next;
        while (pre != null && pre.val != val) {
            pre = pre.next;
            cur = cur.next;
        }
        if (pre.val==val){
            cur.next = cur.next.next;
        }
        return head;
    }





}