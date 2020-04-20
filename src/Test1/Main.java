package Test1;

/**
 * @ClassName Main
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/4/20 16:48
 */
public class Main {
    public static void main(String[] args) {
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
    //    ListNode a  = fun1(node1,1);
     //   System.out.println(a.val);
    }
}