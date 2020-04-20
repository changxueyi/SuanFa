package Test1;

/**
 * @ClassName SX_删除链表中重复元素排序
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/4/20 10:51
 */
public class SX_删除链表中重复元素排序 {
    //排好顺序的元素,,这是一种错误的解答方式

    //这是一种错误的解答，跑不通过 测试用例 1 1 2 3 3
   /* public static ListNode deleteDuplicates(ListNode head) {
        if (head==null||head.next==null){
            return head;
        }
        ListNode cur = head;
        ListNode pre = head.next;
        while (pre!=null){
            if (pre.val==cur.val){
                pre = pre.next;
            }else {
                cur= pre;
                pre = pre.next;
            }
        }
        return head;
    }*/

    public static ListNode deleteDuplicates(ListNode head) {
        ListNode cur = head;
        while (cur != null && cur.next != null) {
            if (cur.next.val == cur.val) {
                cur.next = cur.next.next;
            } else {
                cur = cur.next;
            }
        }
        return head;
    }

    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(1);
        ListNode node3 = new ListNode(2);
        ListNode node4 = new ListNode(3);
        ListNode node5 = new ListNode(3);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        ListNode a = deleteDuplicates(node1);
        while (node1 != null) {
            System.out.print(node1.val + "->");
            node1 = node1.next;
        }
    }
}