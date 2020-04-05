package 动态数组02;

/**
 * @ClassName Asserts
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/2/12 10:47
 */
public class Asserts {
    public static  void test(boolean value){
        try {
            if (!value) throw new Exception("测试未通过");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}