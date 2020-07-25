package LeetCode.链表;

import java.util.LinkedList;
import java.util.List;

/**
 * @ClassName _18_删除链表的节点
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/2/29 21:15
 */
public class _18_删除链表的节点 {
    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public static ListNode deleteNode(ListNode head, int val) {
        //https://leetcode-cn.com/problems/shan-chu-lian-biao-de-jie-dian-lcof/solution/mian-shi-ti-18-shan-chu-lian-biao-de-jie-dian-shua/
        //典型的快慢指针，双指针走路，一个走在前，一个走在后，
        //当走在前的那个指针指到val 或者 走完等于null时候，跳出来
        //让走在后面的直接 指过去，即可删除这个节点
        if (head == null) return null;
        //删除头结点时
        if (head.val == val)
            return head.next;
        //定义两个指针，一前一后
        ListNode pre = head;
        ListNode cur = head.next;
        while (cur != null && cur.val != val) {
            pre = cur;
            cur = cur.next;
        }
        pre.next = cur.next;
        return head;
    }

    // 08点52分 2020/7/25 北京
    public static ListNode deleteNode1(ListNode head, int val) {
        if (head.val == val)
            return head.next;
        ListNode pre = head;
        ListNode cur = head.next;
        while (cur != null && cur.val != val) {
            pre = cur;
            cur = cur.next;
        }
        if (cur!=null)
            pre.next = cur.next;
        return head;
    }

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        ListNode node1 = new ListNode(4);
        ListNode node2 = new ListNode(5);
        ListNode node4 = new ListNode(1);
        ListNode node5 = new ListNode(9);
        node1.next = node2;
        node2.next = node4;
        node4.next = node5;
        System.out.println("删除链表的节点：" + deleteNode1(node1, 5));
        while (node1 != null) {
            System.out.print(node1.val + "->");
            node1 = node1.next;
        }
    }




  /*  //20点47分  2020/3/14
    public ListNode deleteNode2(ListNode head, int val) {
<<<<<<< HEAD
        if (head.val == val) return head.next;
        ListNode pre = head;
        ListNode cur = head.next;
        while (cur != null && cur.val != val) {
=======
        if (head.val==val) return head.next;
        ListNode pre = head;
        ListNode cur = head.next;
        while (cur!=null && cur.val != val){
>>>>>>> a454660e5d5a51bb6461888777cf74cf727f8c22
            pre = cur;
            cur = cur.next;
        }
        pre.next = cur.next;
        return head;
    }

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        ListNode node1 = new ListNode(4);
        ListNode node2 = new ListNode(5);
        ListNode node3 = new ListNode(9);
        ListNode node4 = new ListNode(1);
        ListNode node5 = new ListNode(9);
        linkedList.add(node1);
        linkedList.add(node2);
        linkedList.add(node3);
        linkedList.add(node4);
        linkedList.add(node5);

<<<<<<< HEAD
        System.out.println("删除链表的节点：" + deleteNode(node1, 5));
=======
        System.out.println("删除链表的节点："+deleteNode(node1, 5) );
>>>>>>> a454660e5d5a51bb6461888777cf74cf727f8c22
    }*/
}