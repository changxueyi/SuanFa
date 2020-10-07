package LeetCode.链表;

/**
 * @ClassName _83_删除排序链表中重复元素__重点
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/4/14 9:48
 */
public class _83_删除排序链表中重复元素__重点 {
    //排序好的
    public ListNode deleteDuplicates(ListNode head) {
        ListNode cur = head;
        //可以写成 while(cur.next!=null)
        while (cur != null && cur.next != null) {
            if (cur.val == cur.next.val) {
                cur.next = cur.next.next;
            } else {
                cur = cur.next;
            }
        }
        return cur;
    }

    //14点05分 2020/07/25 北京
    public ListNode deleteDuplicates1(ListNode head) {
        ListNode cur = head;
        while (cur != null && cur.next != null) {
            if (cur.val == cur.next.val) {
                cur.next = cur.next.next;
            }else {
                cur = cur.next;
            }
        }
        return cur;
    }


}