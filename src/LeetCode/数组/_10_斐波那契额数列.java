package LeetCode.数组;

/**
 * @ClassName _10_斐波那契额数列
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/2/20 23:47
 */
public class _10_斐波那契额数列 {
    public int fib(int n) {
        if (n<=1){
            return n;
        }
        int first = 0;
        int second = 1;
        for (int i =0;i<n-1;i++){
            int sum=(first+second)% 1000000007;
            first= second;
            second=sum;
        }
        return second;
    }
}