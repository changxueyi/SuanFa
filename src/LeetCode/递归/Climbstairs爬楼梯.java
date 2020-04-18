package LeetCode.递归;

/**
 * @ClassName Climbstairs爬楼梯
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/4/18 16:12
 */
public class Climbstairs爬楼梯 {
    //爬楼梯问题
    int fun(int n){
        if (n<=2) return n;
        return fun(n-1)+fun(n-2);
    }
}