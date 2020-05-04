package Test1;

/**
 * @ClassName Test1
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/4/19 21:56
 */
public class Test1 {
    public ListNode fun(ListNode l1, ListNode l2) {
        ListNode a = l1;
        ListNode b = l2;
        ListNode pre = new ListNode(1);
        ListNode cur = pre;

        while (a != null && b != null) {
            if (b.val > a.val) {
                cur.next = a;
                a = a.next;
            } else {
                cur.next = b;
                b = b.next;
            }
            //都要走下面这步
            cur = cur.next;
        }
        if (a == null) {
            cur.next = b;
        }
        if (b == null) {
            cur.next = a;
        }
        return pre.next;
    }
    public static int fib(int n) {
        if (n == 2 || n == 1)
            return 1;
        int prev = 1, curr = 1;
        for (int i = 3; i <= n; i++) {
            int sum = prev + curr;
            prev = curr;
            curr = sum;
        }
        return curr;
    }
    //1 1 2 3 5 8
    public static void main(String[] args) {
        /*int a = fib(4);
        System.out.println(a);*/
        String s = "hangcxcueyi";
        int a =s.indexOf('c');
        System.out.println(a);
    }

}