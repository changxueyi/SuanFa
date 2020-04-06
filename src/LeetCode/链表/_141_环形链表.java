package LeetCode.链表;

/**
 * @ClassName _141_环形链表
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/4/5 14:18
 */
public class _141_环形链表 {
    public boolean hasCycle(ListNode head) {
        if (head==null||head.next==null){
            return false;
        }
        ListNode slow = head;
        ListNode fast = head.next;
        while (slow!=fast){
            if (fast==null||fast.next==null){
                return false;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        return true;
    }
    //14点23分 2020/4/5
    public boolean hasCycle02(ListNode head){
        if (head==null || head.next==null){
            return false;
        }
        ListNode slow = head;
        ListNode fast = head.next;
        while (slow!=fast){
            if (fast==null||fast.next==null){
                return false;
            }
            slow=slow.next;
            fast=fast.next.next;
        }
        return true;
    }
}