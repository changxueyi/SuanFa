package Test2;

/**
 * @ClassName Test02
 * @Description 求的是阶乘
 * @Author changxueyi
 * @Date 2020/4/2 20:24
 */
public class Test02 {
    public int Fun(int n) {
        if (n <= 1)
            return n;
        return n * Fun(n - 1);
    }

    public static void main(String[] args) {
       Test02 test02  = new Test02();
        System.out.println(test02.Fun(5));
    }
}