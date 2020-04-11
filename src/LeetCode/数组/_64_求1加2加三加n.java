package LeetCode.数组;

/**
 * @ClassName _64_求1加2加三加n
 * @Description TODO 求 1+2+...+n ，要求不能使用乘除法、for、while、if、else、switch、case等关键字
 * 及条件判断语句（A?B:C）。
 * @Author changxueyi
 * @Date 2020/4/11 14:10
 */
public class _64_求1加2加三加n {
    //方式一：1+2+3+。。。+n
    public static  int sumNums(int n) {
        if (n<=1){
            return n;
        }
       else
           return n+sumNums(n-1);
    }
    //求和方式二
    public static int sumNums01(int n){
        int sum = 0 ;
        for (int i = 0;i<=n;i++){
            sum += i;
        }
        return sum;
    }
    //不用任何修饰符解决这个问题
    //不能用循环，那么可以使用递归调用求和
    // 。但又不能使用if，结束条件如何生效？可以使用如下形式替代if语句
    public static  int sumNums02(int n){
        int sum = 0;
        //省略if的一种方式，Boolean b = 判断条件&&待执行的语句>0;
        //背会这种套路
        boolean b = (n>0)&&(sum=n+sumNums02(n-1))>0;
        return sum;
    }

    public static void main(String[] args) {
        int a = sumNums02(4);
        System.out.println(a);
    }
}