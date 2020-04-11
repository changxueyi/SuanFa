package LeetCode.链表;

/**
 * @ClassName _52_两个链表的第一个公共节点
 * @Description TODO https://blog.csdn.net/qq_43502142/article/details/86600842
 * @Author changxueyi
 * @Date 2020/4/5 10:55
 */
public class _52_两个链表的第一个公共节点 {
    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        /**
         * 我的思考： 两个链表都遍历一边，相减再重写的遍历，相遇，返回结果
         * 思路一：具体算法为：分别遍历两个链表，得到分别对应的长度。然后求长度的差值，把较长的那个链表向后移动这个差值的个数，然后一一比较即可。
         */
        if (headA == null || headB == null) return null;
        //定义
        ListNode cur1 = headA;
        ListNode cur2 = headB;
        int lenA = getLength(cur1);
        int lenB = getLength(cur2);
        if (lenA > lenB) {
            for (int i = 0; i < lenA - lenB; i++)
                cur1 = cur1.next;
        } else {
            for (int i = 0; i < lenB - lenA; i++)
                cur2 = cur2.next;
        }
        while (cur1 != null && cur2 != null && cur1 != cur2) {
            cur1 = cur1.next;
            cur2 = cur2.next;
        }
        return (cur1 != null && cur2 != null) ? cur1 : null;//注意点1：考虑两个链表没有公共节点的情况
    }

    //传入一个链表，求出链表的长度
    public static int getLength(ListNode head) {
        int cnt = 0;
        ListNode cur = head;
        while (cur != null) {
            ++cnt;
            cur = cur.next;
        }
        return cnt;
    }

    //测试
    public static void main(String[] args) {
        // node 1      1 -> 2 ->3 ->6 ->7
        // node 2    4 ->5->6 ->7
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        ListNode node6 = new ListNode(6);
        ListNode node7 = new ListNode(7);
        node1.next = node2;
        node2.next = node3;
        node3.next = node6;
        node4.next = node5;
        node5.next = node6;
        node6.next = node7;
        ListNode commonNode = getIntersectionNode(node1, node4);
        System.out.println(commonNode.val);

    }
}