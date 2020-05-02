package LeetCode.leetcode精选TOP100;

/**
 * @ClassName lc_70_爬楼梯____重点
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/4/30 11:05
 */
public class lc_70_爬楼梯____重点 {
    public static int climbStairs(int n) {
        if (n == 1) {
            return 1;
        }
        int first = 1;
        int second = 2;
        for (int i = 3; i <= n; i++) {
            int third = first + second;
            first = second;
            second = third;
        }
        return second;
    }

    public static void main(String[] args) {
        int result = climbStairs(3);
        System.out.println(result);
    }
}