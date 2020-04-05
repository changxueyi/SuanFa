package Test2;

/**
 * @ClassName Test03
 * @Description 斐波那契额数列
 * @Author changxueyi
 * @Date 2020/4/2 20:27
 */
public class Test03 {
    public int fun(int n) {
        if (n <= 1)
            return n;
        return fun(n - 2) + fun(n - 1);
    }

    //菲薄纳妾 改进版
    //0 1 1 2 3 5 8 13
    public int fun02(int n) {
        int first = 0;
        int second = 1;
        for (int i = 0; i < n-1; i++) {
            int sum= first+second;
            first = second;
            second = sum;
        }
        return second;
    }

    public static void main(String[] args) {
        Test03 test03 = new Test03();
        System.out.println(test03.fun02(64));
    }
}