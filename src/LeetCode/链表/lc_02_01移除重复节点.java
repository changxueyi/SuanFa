package LeetCode.链表;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @ClassName lc_02_01移除重复节点
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/4/15 14:16
 */
public class lc_02_01移除重复节点 {
    public ListNode removeDuplicateNodes(ListNode head) {
        HashMap<Integer, Integer> map = new HashMap<>();
        while (head != null) {
            if (!map.containsKey(head.val)) {
                map.put(head.val, head.val);
            }
            head = head.next;
        }
        int arr[] = new int[map.size()];
        for (int i = 0; i < map.size(); i++) {
            arr[i] = map.get(i);
        }
        ListNode head1 = new ListNode(arr[0]); // 把数组的第一个位置定义为头结点
        ListNode other = head1; // 一个指针，此时指向头结点
        for (int i = 1; i < arr.length; i++) { //头结点已经定义，从1开始
            ListNode temp = new ListNode(arr[i]);
            other.next = temp;
            other = other.next;

        }//在此处打印结点容易导致head的变化
        return head1;
    }

    //最容易理解的方式 移除重复节点： 双指针 + hashmap
    public ListNode removeDuplicateNodes1(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode pre = head;
        ListNode latter = null;
        Map<Integer, Integer> map = new HashMap<>();
        while (pre != null) {
            if (!map.containsKey(pre.val)) {
                //把重复的清除了
                map.put(pre.val, 1);
                latter = pre;
                pre = pre.next;
            } else {
                pre = pre.next;
                latter.next = pre;
            }
        }
        return head;
    }

    //18点13分 2020/07/22
    public ListNode removeDuplicateNodes2(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode pre = head;
        ListNode latter = null;
        Map<Integer, Integer> map = new HashMap<>();
        while (pre != null) {
            if (!map.containsKey(pre.val)) {
                //把重复的清除了
                map.put(pre.val, 1);
                latter = pre;
                pre = pre.next;
            } else {
                pre = pre.next;
                latter.next = pre;
            }
        }
        return head;
    }


}