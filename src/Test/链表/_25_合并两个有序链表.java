package Test.链表;

/**
 * @ClassName _25_合并两个有序链表
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/3/8 20:43
 */
public class _25_合并两个有序链表 {
    public class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
 }
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head1 = l1;
        ListNode head2 = l2;
        //创建一个链表
        ListNode newHead = new ListNode(-1);
        ListNode ptr = newHead;
        while (head1!=null&&head2!=null){
           if (head1.val<head2.val){
               ptr.next =head1;
               head1= head1.next;
           }else {
               ptr.next = head2;
               head2 = head2.next;
           }
            ptr = ptr.next;
        }
        if (head1==null){
            ptr.next=head2;
        }else {
            ptr.next=head1;
        }
        return newHead.next;
    }
}