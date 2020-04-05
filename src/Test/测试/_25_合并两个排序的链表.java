package Test.测试;


/**
 * @ClassName _25_合并两个排序的链表
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/2/28 20:27
 */
public class _25_合并两个排序的链表 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode a1 = l1;
        ListNode a2 = l2;
        //初始化一个节点值为0的空节点
        ListNode newListNode = new ListNode(0);
        //创建头节点
        ListNode a3 = newListNode;
        //让 a1.val 与 a2.val 比较，如果a1大，则newListNode指向a1，
        while (a1 != null && a2 != null) {
            if (a1.val > a2.val) {
                a3.next = a2;
                a2 = a2.next;
            } else {
                a3.next = a1;
                a1 = a1.next;
            }
            a3 = a3.next;
        }
        if (a1 == null) {
            a3.next = a2;
        } else {
            a3.next = a1;
        }
        return newListNode.next;
    }

    public static void main(String[] args) {

    }
}