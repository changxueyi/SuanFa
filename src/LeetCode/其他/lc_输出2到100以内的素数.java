package LeetCode.其他;

/**
 * @ClassName lc_输出2到100以内的素数
 * @Description TODO https://blog.csdn.net/qq_37575217/article/details/56019837?depth_1-utm_source=distribute.pc_relevant.none-task-blog-BlogCommendFromBaidu-5&utm_source=distribute.pc_relevant.none-task-blog-BlogCommendFromBaidu-5
 * @Author changxueyi
 * @Date 2020/4/24 9:06
 */
public class lc_输出2到100以内的素数 {
    public static void main(String[] args) {
        //素数定义：素数必须是大于1的，并且除了1，和他本身不再有其他因数的数字

        // 设置范围
        for (int i = 2; i < 100; i++) {
            //设置个开关
            boolean flag = true;
            //那就从2-X（包括2，不包括X）开始一个一个相除，
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.print(i + " ");
            }
        }
    }


}


