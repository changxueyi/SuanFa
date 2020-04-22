package Test1;

/**
 * @ClassName SX_青蛙跳台阶
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/4/21 9:08
 */
public class SX_青蛙跳台阶 {
    public static int fun(int n) {
        if (n <= 2)
            return n;
        return fun(n - 1) + (n - 2);
    }

    public static void main(String[] args) {
        int a = fun(100);
        System.out.println(a);
    }
}