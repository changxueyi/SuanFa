package Test.链表;

/**
 * @ClassName _18_删除链表的节点
 * @Description 给定单向链表的头指针和一个要删除的节点的值，定义一个函数删除该节点。
 * 返回删除后的链表的头节点。
 * 输入: head = [4,5,1,9], val = 5
 * 输出: [4,1,9]
 * 解释: 给定你链表中值为 5 的第二个节点，那么在调用了你的函数之后，该链表应变为 4 -> 1 -> 9.
 * @Author changxueyi
 * @Date 2020/4/5 10:15
 */
public class _18_删除链表的节点 {
    public ListNode deleteNode(ListNode head, int val) {
        if (head.val==val) return head.next;
        ListNode cur = head;
        ListNode pre = head.next;
        while (pre!=null&&pre.val!=val){
            cur = pre;
            pre = pre.next;
        }
        if (pre!=null){
            //或者cur.next = cur.next.next;
            cur.next =pre.next;
        }
        return head;
    }
}