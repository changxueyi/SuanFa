package LeetCode.链表;

/**
 * @ClassName lc_1290_二进制链表转整数
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/4/13 16:26
 */
public class lc_1290_二进制链表转整数 {
    public static int getDecimalValue(ListNode head) {
        //思想：二进制转化为十进制

        //二进制转十进制
        int decimal = 0;

        while (head != null) {

            //这行代码不容易想出来
            //似将二进制转换为十进制的方法，每进一位乘一个2
            decimal = decimal * 2 + head.val;
            head = head.next;
        }

        return decimal;
    }

    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(1);
        ListNode node3 = new ListNode(0);
        ListNode node4 = new ListNode(1);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        int commonNode  = getDecimalValue(node1);
        System.out.println(commonNode);

    }


}