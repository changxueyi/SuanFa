package LeetCode.其他;


import java.util.*;

/**
 * @ClassName SX_20200425
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/4/26 15:19
 */
public class SX_20200425 {
    //问题一： 手写非递归后序遍历
    public List<Integer> houxu(TreeNode root) {
        if (root == null) return null;
        LinkedList<TreeNode> list = new LinkedList<>();
        LinkedList<Integer> arr = new LinkedList<>();

        list.offer(root);
        while (!list.isEmpty()) {
            TreeNode node = list.pollLast();
            arr.add(node.val);
            if (node.left != null) {
                list.add(node.left);
            }
            if (node.right != null) {
                list.add(node.right);
            }
        }
        return arr;
    }

    //问题二：实现链表的反转
    public ListNode fanzhuan(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode newHead = fanzhuan(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }

    public ListNode fanzhuan1(ListNode head) {
        ListNode cur = head;
        ListNode pre = null;
        ListNode temp = null;
        while (head != null) {
            temp = cur.next;
            cur.next = pre;
            pre = cur;
            cur = temp;
        }
        return pre;
    }

    //问题三：层序遍历
    public void cengxu(TreeNode root) {
        if (root == null) return;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (queue != null) {
            TreeNode node = queue.poll();
            System.out.println(node.val);
            if (root.left != null) {
                queue.add(root.left);
            }
            if (root.right != null) {
                queue.add(root.right);
            }
        }
    }

    //问题四：动态规划的思想： 就是解决递归过程中，f（0） 重复计算的问题，减少到只需要算一次即可

    //问题五：  问题不明确：无法解答


    //问题六： 给定一个数组，求数组中第二大的值        字节跳动


    //最垃圾的写法   ---最坏的打算 （最好再写个更加优化的方案）
    public static int twoMax(int[] arr) {
        if (arr == null || arr.length == 0)
            return -1;
        Arrays.sort(arr);
        int a = arr.length - 1;
        int j = a - 1;
        while (j >= 0) {
            if (arr[a] != arr[j]) {
                return arr[j];
            } else {
                j--;
            }
        }
        return -1;
    }

   /* public static void main(String[] args) {
        int[] arr = {4,4,4,4,4,4};
        int a=  twoMax(arr);
        System.out.println(a);
    }*/

    //问题 7 :
    // 约瑟夫环问题： 围成一个圈，每次让3出去
    public static int yuesefu(int n) {
        //分析：第一次出去的是cur = n（0) 第二次：（cur+3 -1）% n
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr.add(i);
        }
        int cur = 0;
        while (n > 1) {
            cur = (cur + 3 - 1) % n;
            arr.remove(cur);
            n--;
        }
        return arr.get(0);
    }

   /* public static void main(String[] args) {
        int n = 5;
        int a = yuesefu(n);
        System.out.println(a);
    }*/

    //问题 8 ：给个链表，1-2-3-4-5，旋转链表k次，如旋转2次，变成4-5-1-2-3  招行信用卡

    //问题 9  ：智力题

    /**
     * 有1000个一模一样的瓶子，其中999瓶中装的是普通的水，一瓶是毒药，水和毒药只能通过老鼠来分辨，喝下毒药的老鼠会在一个星期后死亡（刚好一个星期）。现在你有一个星期时间，请问至少需要多少只老鼠才能确定出哪个瓶子装的是毒药？
     */

    //问题10 ： 老鼠喝毒药问题

    //问题11. 删除单链表的倒数第N个节点，返回新链表    富图
    public int shanchuK(ListNode head, int k) {
        if (head == null || head.next == null) return -1;
        ListNode cur = head;
        ListNode pre = head;
        for (int i = 0; i < k; i++) {
            pre = pre.next;
        }
        while (pre != null) {
            pre = pre.next;
            cur = cur.next;
        }
        return cur.val;
    }

    //问题12 二叉树的非递归前序遍历    京东
    public List<Integer> qianxu(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        List<Integer> arr = new ArrayList<>();
        TreeNode cur = root;
        while (!stack.isEmpty() || cur != null) {
            if (cur != null) {
                arr.add(root.val);
                stack.push(root);
                cur = cur.left;
            } else {
                cur = stack.pop().right;
            }
        }
        return arr;
    }

    //问题13: leetcode 41. 缺失的第一个正数     美团
    public int firstMissingPositive(int[] nums) {
        return -1;
    }

    //有10亿个电话号码，找出重复的 , 如何操作 ???

    //问题14：微信红包

    //问题15：美团二面： 删除字符串中出现次数最小的字符


}