package LeetCode.链表;

/**
 * @ClassName lc_02_03删除中间的节点
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/4/14 10:40
 */
public class lc_02_03删除中间的节点 {
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next  = node.next.next;
    }
}