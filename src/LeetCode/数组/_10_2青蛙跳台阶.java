package LeetCode.数组;

/**
 * @ClassName _10_2青蛙跳台阶
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/2/21 9:16
 */
public class _10_2青蛙跳台阶 {

    public int numWays(int n) {
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

    /**
     * 北京京东集团
     * 18点15分 2020/9/22
     */
    public static int fun(int n) {
        if (n == 1) {
            return n;
        }
        if (n == 2) {
            return n;
        }
        int first = 1;
        int second = 1;
        for (int i = 2; i < n; i++) {
            int sum = first + second;
            first = second;
            second = sum;
        }
        return second;
    }

    public static int fun1(int n) {
        if (n==1||n==2){
            return 1;
        }
        return fun1(n-1)+fun1(n-2);
    }

    public static void main(String[] args) {
        int result = fun(4);
        System.out.println(result);
    }


}