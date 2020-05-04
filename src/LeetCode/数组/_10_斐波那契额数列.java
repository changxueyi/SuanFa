package LeetCode.数组;

/**
 * @ClassName _10_斐波那契额数列
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/2/20 23:47
 */
public class _10_斐波那契额数列 {
    public int fib(int n) {
        if (n <= 1) {
            return n;
        }
        int first = 0;
        int second = 1;
        for (int i = 0; i < n - 1; i++) {
            int sum = (first + second) % 1000000007;
            first = second;
            second = sum;
        }
        return second;
    }

    //完美的解法
    public static int fib1(int n) {
        if (n == 1) {
            return n;
        }
        if (n == 2) {
            return n;
        }
        int first = 1;
        int second = 1;
        for (int i = 3; i <= n; i++) {
            int sum = first + second;
            first = second;
            second = sum;
        }
        return second;
    }

    public static void main(String[] args) {
        //1 1 2  3 5 8 13
        int result = fib1(4);
        System.out.println(result);
    }
}