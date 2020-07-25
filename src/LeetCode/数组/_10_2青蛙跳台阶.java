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


}