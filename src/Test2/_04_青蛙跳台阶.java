package Test2;

/**
 * @ClassName _04_青蛙跳台阶
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/4/3 13:58
 */
public class _04_青蛙跳台阶 {
    //跳上n阶台阶需要多少种跳法
    public int numWays(int n) {
        if (n==1){
            return 1;
        }
       return numWays(n-1)+numWays(n-2);
    }
}