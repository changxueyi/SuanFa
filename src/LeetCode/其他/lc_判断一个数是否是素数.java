package LeetCode.其他;

/**
 * @ClassName lc_判断一个数是否是素数
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/4/24 9:08
 */
public class lc_判断一个数是否是素数 {

    private static boolean isPrim(int src) {
        double sqrt = Math.sqrt(src);
        if (src < 2) {
            return false;
        }
        if (src == 2 || src == 3) {
            return true;
        }
        if (src % 2 == 0) {// 先判断是否为偶数，若偶数就直接结束程序
            return false;
        }
        for (int i = 3; i <= sqrt; i += 2) {
            if (src % i == 0) {
                return false;
            }
        }
        return true;
    }

    //自己写的判断是否是素数
    //10点38分 2020/4/24
    public static boolean fun(int n) {
        if (n <= 1)
            return false;
        for (int j = 2; j < n; j++) {
            if (n % j == 0) {
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        int a = 5;
        System.out.println(fun(a));
    }
}
