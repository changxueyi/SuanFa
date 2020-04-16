package LeetCode.链表;

/**
 * @ClassName lc_237_删除链表节点
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/4/13 16:00
 */
public class lc_237_删除链表节点 {
    public void deleteNode(ListNode node) {
        //我们必须将想要删除的节点的值替换为它后面节点中的值，然后删除它之后的节点
        node.val = node.next.val;
        node.next = node.next.next;
    }
}