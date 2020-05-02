package Test4;

/**
 * @ClassName Test10_求链表的中间节点
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/4/28 16:24
 */
public class Test10_求链表的中间节点 {

        public ListNode middleNode(ListNode head) {
            ListNode slow = head;
            ListNode fast = head;
            while (fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;
            }
            return slow;
        }

}