package Test1;

import java.util.Arrays;

/**
 * @ClassName SX_02删除
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/4/21 14:25
 */
public class SX_02删除 {
    //1.第一种，数组的删除，数组中的元素是拍好顺序的，需要删除所有重复的元素
    public static int fun01(int[] arr) {
        if (arr.length == 0 || arr == null) {
            return -1;
        }
        int a = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[a] != arr[i]) {
                a++;
                arr[a] = arr[i];
            }
        }
        return a + 1;
    }

    //第二种删除，删除链表中重复，元素有序
    //给定一个排序链表，删除所有重复的元素，使得每个元素只出现一次。
    //https://leetcode-cn.com/problems/remove-duplicates-from-sorted-list/

    public static ListNode fun02(ListNode head) {
        ListNode a = head;
        //注意：这里一定是并且&&才符合逻辑
        while (a != null && a.next != null) {
            if (a.val == a.next.val) {
                a.next = a.next.next;
            } else {
                a = a.next;
            }
        }
        return head;
    }

    //删除链表的节点
    public static ListNode fun03(ListNode head, int val) {
        if (head == null || head.next == null) {
            return head;
        }
        if (head.val == val) {
            return head.next;
        }

        ListNode cur = head;
        ListNode pre = head.next;
        while (pre != null && pre.val != val) {
            pre = pre.next;
            cur = cur.next;
        }
        if (pre.val == val) {
            cur.next = cur.next.next;
        }
        return head;

    }

    public static void main(String[] args) {
        //测试fun01
        int arr[] = new int[]{1, 2, 2, 2, 3, 4, 4, 4};
        System.out.println(fun01(arr));
        //测试02
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(2);
        ListNode node4 = new ListNode(2);
        ListNode node5 = new ListNode(3);
        ListNode node6 = new ListNode(5);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;
        ListNode a = fun02(node1);
        while (node1 != null) {
            System.out.print(node1.val + "->");
            node1 = node1.next;
        }

    }
}