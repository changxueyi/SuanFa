package Test3;

/**
 * @ClassName SX_03_青蛙跳台阶
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/4/24 14:04
 */
public class SX_03_青蛙跳台阶 {
    public static int fun(int n) {
        if (n <= 1) {
            return n;
        }
        return fun(n - 1) + fun(n - 2);
    }

    //斐波那契数列
    //0 1 1 2 3 5 8 13
    public static int fun02(int n) {
        if (n <= 1)
            return n;
        int first = 0;
        int second = 1;
        for (int i = 0; i < n - 1; i++) {
            int sum = first + second;
            first = second;
            second = sum;
        }
        return second;
    }

    public static void main(String[] args) {
        int b = fun(10);
        System.out.println(b);
        //
        int c = fun02(6);
        System.out.println(c);
    }
}