package Test4;

import LeetCode.链表.ListNode;

/**
 * @ClassName Main
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/4/20 7:56
 */
public class Main {
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
        node3.next = node4;
        node4.next = node5;
    //    node5.next = node6;
     //   node6.next = node7;


        //直观打印一个链表的方式
   /*   ListNode currNode = reversePrint(node1);
        while (currNode.next != null) {
            System.out.print(currNode.val);
            System.out.print("->");
            currNode = currNode.next;
        }
        System.out.print(currNode.val);
        System.out.println();*/

    }
}