package LeetCode.链表;

/**
 * @ClassName lc_24_两两交换链表中的节点
 * @Description TODO https://segmentfault.com/a/1190000020730451?utm_source=tag-newest
 * https://leetcode-cn.com/problems/swap-nodes-in-pairs/
 * @Author changxueyi
 * @Date 2020/4/27 22:26
 */
public class lc_24_两两交换链表中的节点 {
    //两两交换，其实是4个节点的 变动 https://segmentfault.com/a/1190000020730451?utm_source=tag-newest
    public ListNode swapPairs(ListNode head) {
        //链表头增加要给虚拟节点dummy
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        head = dummy;
        //循环退出条件，注意链表节点点数是单双的情况
        while (head.next != null && head.next.next != null) {
            //开始反转
            ListNode a = head.next;
            ListNode b = a.next;
            head.next = b;//步骤1
            a.next = b.next;
            a.next = a;//步骤2
            //dummy 指针前移
            head = a;
        }
        return dummy.next;
    }


    //自己清晰看懂的代码，特别的好理解
    //https://leetcode-cn.com/problems/swap-nodes-in-pairs/solution/hua-jie-suan-fa-24-liang-liang-jiao-huan-lian-biao/
    public ListNode swapPairs1(ListNode head) {
        ListNode pre = new ListNode(0);
        pre.next = head;
        ListNode temp = pre;
        //终止条件，head ==null或者 next为null

        //下面这行代码言外之意就是：如果剩一个节点，不去处理，剩下两个采取处理这个
        while(temp.next != null && temp.next.next != null) {
            ListNode start = temp.next;
            ListNode end = temp.next.next;
            temp.next = end;
            //这个位置特别的注意，下面两行代码不要弄反了
            start.next = end.next;
            end.next = start;
            temp = start;
        }
        return pre.next;
    }

    //递归解法
    //https://leetcode-cn.com/problems/swap-nodes-in-pairs/solution/hua-jie-suan-fa-24-liang-liang-jiao-huan-lian-biao/
    //返回值：交换完成的子链表
    //调用单元：设需要交换的两个点为 head 和 next，head 连接后面交换完成的子链表，next 连接 head，完成交换
    //终止条件：head 为空指针或者 next 为空指针，也就是当前无节点或者只有一个节点，无法进行交换
    public ListNode swapPairs2(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode next = head.next;
        head.next = swapPairs(next.next);
        next.next = head;
        return next;
    }



}