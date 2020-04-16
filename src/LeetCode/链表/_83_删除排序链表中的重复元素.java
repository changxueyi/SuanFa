package LeetCode.链表;

/**
 * @ClassName _83_删除排序链表中的重复元素
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/4/14 9:48
 */
public class _83_删除排序链表中的重复元素 {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode cur = head;
        while (cur!=null&&cur.next != null){
            if (cur.val == cur.next.val){
                cur.next = cur.next.next;
            }else {
                cur = cur.next;
            }
        }
        return cur;
    }
}