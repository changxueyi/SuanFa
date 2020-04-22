package Test1;

/**
 * @ClassName SX_10斐波那契数列
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/4/21 9:30
 */
public class SX_10斐波那契数列 {
    //  0 1 1 2  3 5 8 13
    public static int fib(int n) {
        if (n <= 1)
            return n;
        int first = 0;
        int two = 1;
        for (int i = 0; i < n - 1; i++) {
            int sum = first + two;
            first = two;
            two = sum;
        }
        return two;
    }

    public static void main(String[] args) {
        int a  =fib(6);
        System.out.println(a);
    }

}