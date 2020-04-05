package Test.测试;

/**
 * @ClassName _22_链表中倒数第K个节点
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/3/25 21:55
 */
public class _22_链表中倒数第K个节点 {
    //思路就是快慢指针，第一个快的指针先走K步，接着，一块走
    //当快的指针走完，为null的时候，直接返回slow指的就可以
    public ListNode getKthFromEnd(ListNode head, int k) {
        ListNode fast  = head;
        ListNode slow =  head;
        //先走K步
        for (int i = 0 ; i<k;i++){
            fast = fast.next;
        }
        while (fast!=null){
            fast = fast.next;
            slow =  slow.next;
        }
        return slow;
    }
}