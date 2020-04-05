package Test2;

/**
 * @ClassName _05_斐波那契
 * @Description
 *   0 1 1 2 3 5 8
 *   0 1 2 3 4 5 6
 * @Author changxueyi
 * @Date 2020/4/3 14:03
 */
public class _05_斐波那契 {
    public int fun(int n) {
        if (n==0){
            return 0;
        }
        if (n==1){
            return 1;
        }
        int first = 0;
        int second = 1;
        for (int i = 0;i<n-1;i++){
            int sum = first+second;
            first = second;
            second = sum;
        }
        return second;
    }
}