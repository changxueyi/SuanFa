package Test.测试;

/**
 * @ClassName _15_二进制中1的个数
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/3/25 21:49
 */
public class _15_二进制中1的个数 {
    public int hammingWeight(int n) {
        int res = 0;
        while (n!=0){
            if ((n & 1) == 1){
                res++;
            }
            n>>>=1;
        }
        return res;
    }
}