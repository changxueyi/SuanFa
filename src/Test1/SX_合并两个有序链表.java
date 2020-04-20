package Test1;

/**
 * @ClassName SX_合并两个有序链表
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/4/19 17:47
 */
public class SX_合并两个有序链表 {
    //https://leetcode-cn.com/problems/he-bing-liang-ge-pai-xu-de-lian-biao-lcof/solution/mian-shi-ti-25-he-bing-liang-ge-pai-xu-de-lian-b-2/
    public ListNode hebing(ListNode l1, ListNode l2) {
        ListNode a = l1; //指向第一个链表
        ListNode b = l2;// 指向第二个链表
        ListNode l3 = new ListNode(1);
        //伪头节点
        ListNode c = l3;
        while (a != null && b != null) {
            if (a.val>b.val){
              c.next = b;
              //b这个节点，等于b.next指指的节点

              b = b.next;
            }
            else {
                c.next = a;
                a = a.next;
            }
            //c 现在等于c.next指针指向的这个节点，包含了val和next
            c = c.next;
        }
        if (a==null){
            c.next = b;
        }else{
            c.next = a;
        }
        //关于为啥是.next ，因为上面是虚拟头节点
        return l3.next;
    }

    /**
     * 初始化： 伪头节点 dumdum ，节点 curcur 指向 dumdum 。
     * 循环合并： 当 l_1
     */
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode dum = new ListNode(0);
        ListNode cur = dum;
        while(l1 != null && l2 != null) {
            if(l1.val < l2.val) {
                cur.next = l1;
                l1 = l1.next;
            }
            else {
                cur.next = l2;
                l2 = l2.next;
            }
            cur = cur.next;
        }
        cur.next = l1 != null ? l1 : l2;
        return dum.next;
    }

}